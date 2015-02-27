FROM centos:centos6

# http://dev.mysql.com/downloads/repo/yum/
RUN yum install -y http://dev.mysql.com/get/mysql-community-release-el6-5.noarch.rpm

RUN yum install -y mysql-server

ADD ./my.cnf /etc/my.cnf

ADD ./init.sql .

RUN service mysqld start && sleep 5s && cat init.sql | mysql

EXPOSE 3306

CMD ["/usr/bin/mysqld_safe"]
