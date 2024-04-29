FROM jboss/wildfly:10.1.0.Final

# Создаем директорию deployments, если ее еще нет
RUN mkdir -p /opt/jboss/wildfly/standalone/deployments/

# Копируем файл в директорию deployments внутри контейнера
COPY ./company-hub-pom/company-hub-ear/target/company-hub-ear.ear /opt/jboss/wildfly/standalone/deployments/
