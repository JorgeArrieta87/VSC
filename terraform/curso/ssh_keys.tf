resource "aws_key_pair" "key-class1" {
    key_name = "class_key1"
    public_key = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDI8eW/4p5s+FKgTgfG7LpO/UYXWMxvx1Z0vTaQ75yXBFDf4KhdT/R1DMN57Zw25QgfbqSwljPNtUdswwXKe46855+vrgggO5OneF6KDOPTrhHa1y05dGlbStd3eFKN/kHQ6mu4RZssCZyOnUBCyqBoD5R3nzXdsFarPTvXYPOHXklkObXG8Zu2Ong6k0uhs4c8WcE+9E9DJ1J29EClfSL88GUF934HH+TSrPJmo0MMO8JbFxgqbLDOa7yubCiqnB4M+2eha6kzje2RfaYvnfki/qHlI/cBz/rbH6BbY15XBVaZZlsQio+QjJLNI3Aj8H3ndF5XErlXgx+4j2yi1zc2DaFXPoKSJYOJrFMCcRkj7FIwAUiZK/IF27Gk+RRP3ZRqLafG3rBRI8u5Qmo5DcqclEREjf82B/lGhrfNZdCSdoJOjXY5qtLKHsYIVezHHb8FZUvJ+HB45Ufeq/EgctFRc473mUDs9stI0BrHesvo4tAPHtWs0tq5dHyPmI2jaKc7mvSD9EdYcALFATlyOIqSjZdzwd2MhAvm3Lnd0lyqGPt5OQlQbih8VW1g3O2s/fMPP4E1NR51whpmQ9n6zUptrY5CHl3cNCAVYurEcOpR4xVBY3Y1GI5eqQpkE6oDLRI2DArdoceiYhs6Bs7etQ1KmWe59fIJuujF8mIyD9UXcw=="
}

resource "aws_key_pair" "key-class2" {
    key_name = "class_key2"
    public_key = "${file("class_key.pem.pub")}"
}