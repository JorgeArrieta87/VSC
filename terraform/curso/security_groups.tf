resource "aws_security_group" "sg-1" {
name = "sg_icmp_ssh"
description = "Permite Trafico solo ICMP, y SSH"
vpc_id =  "${aws_vpc.main1.id}"

ingress {
    description = "SSH Entrada a VPC"
    from_port = 22
    to_port = 22
    protocol = "tcp"
    #cidr_blocks = [aws_vpc.main1.cidr_blocks]
    cidr_blocks = ["0.0.0.0/0"]
}

ingress {
    description = "icmp Entrada a VPC"
    from_port = 0
    to_port = 0
    protocol = "icmp"
    #cidr_blocks = [aws_vpc.main1.cidr_blocks]
    cidr_blocks = ["0.0.0.0/0"]
}

egress {
    description = "Salida permitida a cualquier red"
    from_port = 0
    to_port = 0
    protocol = "-1"
    #cidr_blocks = [aws_vpc.main1.cidr_blocks]
    cidr_blocks = ["0.0.0.0/0"]
}

 tags= {
        Name = "ACL-IN-OUT-SG1"
    }

}

resource "aws_security_group" "sg-2" {
name = "sg_http"
description = "Permite Trafico HTTP, HTTPS"
vpc_id =  "${aws_vpc.main1.id}"

ingress {
    description = "HTTP Entrada a VPC"
    from_port = 80
    to_port = 80
    protocol = "tcp"
    #cidr_blocks = [aws_vpc.main1.cidr_blocks]
    cidr_blocks = ["0.0.0.0/0"]
}

ingress {
    description = "HTTPS Entrada a VPC"
    from_port = 443
    to_port = 443
    protocol = "tcp"
    #cidr_blocks = [aws_vpc.main1.cidr_blocks]
    cidr_blocks = ["0.0.0.0/0"]
}

egress {
    description = "Salida permitida a cualquier red"
    from_port = 0
    to_port = 0
    protocol = "-1"
    #cidr_blocks = [aws_vpc.main1.cidr_blocks]
    cidr_blocks = ["0.0.0.0/0"]
}

 tags= {
        Name = "ACL-IN-OUT-SG2"
    }

}