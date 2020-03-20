FROM daocloud.io/java:8
ADD /target/demo-0.0.1-SNAPSHOT.jar demo.jar
#EXPOSE 8081
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
ENTRYPOINT ["sh","-c","java -jar /demo.jar ${SERVER_PORT} ${MONGODB_URL} ${MONGODB_NAME},${MONGODB_PASSWORD}"]