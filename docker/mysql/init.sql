GRANT ALL ON *.* TO 'root'@'%';

CREATE USER 'hoecoga' IDENTIFIED BY 'hoecoga';

GRANT ALL ON *.* TO 'hoecoga'@'%' IDENTIFIED BY 'hoecoga';

FLUSH PRIVILEGES;
