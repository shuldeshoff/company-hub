FROM jboss/wildfly:10.1.0.Final

# Устанавливаем JDK 11
USER root
RUN curl -L -o /tmp/openjdk.tar.gz https://download.java.net/java/GA/jdk11/9/GPL/openjdk-11.0.2_linux-x64_bin.tar.gz && \
    mkdir -p /usr/lib/jvm && \
    tar -xzf /tmp/openjdk.tar.gz -C /usr/lib/jvm && \
    rm /tmp/openjdk.tar.gz

# Устанавливаем переменные окружения JAVA_HOME и PATH для JDK 11
ENV JAVA_HOME /usr/lib/jvm/jdk-11.0.2
ENV PATH $JAVA_HOME/bin:$PATH

# Опционально: Устанавливаем другие переменные окружения, если необходимо

# Опционально: Копируем настройки WildFly, если требуется настройка
# COPY standalone.xml /opt/jboss/wildfly/standalone/configuration/

# Опционально: Добавляем приложения или настройки, если это необходимо

# Опционально: Указываем команду по умолчанию для запуска WildFly
#CMD ["./bin/standalone.sh", "-b", "0.0.0.0"]

# Копируем архив wildfly.tar.gz в контейнер
COPY wildfly.tar.gz /opt/jboss/

# Распаковываем архив
RUN tar -xzf /opt/jboss/wildfly.tar.gz -C /opt/jboss/wildfly/ --strip-components=1

# Указываем рабочую директорию
WORKDIR /opt/jboss/wildfly/

# Удаляем архив после распаковки (опционально)
RUN rm /opt/jboss/wildfly.tar.gz