provider "aws" {
    region = "us-east-2"
    access_key ="AKIA5MHU5MRUFRTWO2YA" 
    secret_key ="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"
}

#  resource "aws_instance" "test" {
#    ami = "ami-0a54aef4ef3b5f881"
#    instance_type ="t2.micro"
#}

resource "aws_vpc" "main1" {
cidr_block = "10.0.0.0/16"
enable_dns_hostnames = true
tags = {
    Name = "Main VPC 1"
    }
}

resource "aws_subnet" "subnet1" {
    vpc_id = "${aws_vpc.main1.id}"
    cidr_block = "10.0.10.0/24"
    map_public_ip_on_launch = true
    availability_zone = "us-east-2a"

    tags= {
        Name = "Subnet1 - us-east-2a"
    }
}

resource "aws_subnet" "subnet2" {
    vpc_id = "${aws_vpc.main1.id}"
    cidr_block = "10.0.20.0/24"
    map_public_ip_on_launch = true
    availability_zone = "us-east-2b"

    tags= {
        Name = "Subnet2 - us-east-2b"
    }
}

resource "aws_subnet" "subnet3" {
    vpc_id = "${aws_vpc.main1.id}"
    cidr_block = "10.0.30.0/24"
    map_public_ip_on_launch = true
    availability_zone = "us-east-2c"

    tags= {
        Name = "Subnet3 - us-east-2c"
    }
}

resource "aws_internet_gateway" "gw" {
    vpc_id = "${aws_vpc.main1.id}"
    
    tags = {
        Name = "Gateway 1 en us-east-2a"
        }
    }

resource "aws_route_table" "r" {
    vpc_id = "${aws_vpc.main1.id}"

    route {
    cidr_block = "0.0.0.0/0"
    gateway_id = "${aws_internet_gateway.gw.id}"
    }
    tags = {
        Name = "Gateway por defecto"
        }   
}

resource "aws_route_table_association" "table_subnet1" {
    subnet_id = "${aws_subnet.subnet1.id}"
    route_table_id = "${aws_route_table.r.id}"
}

resource "aws_route_table_association" "table_subnet2" {
    subnet_id = "${aws_subnet.subnet2.id}"
    route_table_id = "${aws_route_table.r.id}"
}
    
resource "aws_route_table_association" "table_subnet3" {
    subnet_id = "${aws_subnet.subnet3.id}"
    route_table_id = "${aws_route_table.r.id}"
}