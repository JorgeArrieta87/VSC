resource "aws_instance" "server1" {
    ami = "ami-0a54aef4ef3b5f881"
    instance_type = "t2.micro"
    count = "1"
    subnet_id = "${aws_subnet.subnet1.id}"
    associate_public_ip_address = true
    vpc_security_group_ids = ["${aws_security_group.sg-1.id}" , "${aws_security_group.sg-2.id}"]
    private_ip = "10.0.10.10"
    key_name = "class_key1"
    user_data = "${file("userdata.sh")}"
     
    tags = {
    Name = "Serv1"
    Owner = "user02-tf-demo"
    Env = "dev"
    }
}

resource "aws_instance" "server2" {
    ami = "ami-0a54aef4ef3b5f881"
    instance_type = "t2.micro"
    count = "1"
    subnet_id = "${aws_subnet.subnet1.id}"
    associate_public_ip_address = true
    vpc_security_group_ids = ["${aws_security_group.sg-1.id}" , "${aws_security_group.sg-2.id}"]
    private_ip = "10.0.10.11"
    key_name = "${aws_key_pair.key-class2.id}"
    user_data = <<EOF
#!/bin/bash
echo "Funciona la llamada" > llamadatf.txt
export PATH=$PATH:/usr/local/bin
sudo -i
exec > >(tee /var/log/user-data.log|logger -t user-data -s 2>/dev/console) 2>&1
yum install -y httpd
echo "<html><h1>Hola, Excelente Ejercisio......<p></p>Continuamos!!!</h2></html>" > /var/www/html/index.html
systemctl start httpd
systemctl enable httpd
echo "hola Mundo" > hola.txt
EOF
     
    tags = {
    Name = "Serv2"
    Owner = "user02-tf-demo"
    Env = "dev"
    }
}