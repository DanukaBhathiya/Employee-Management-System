FROM openjdk:8
EXPOSE 6397
COPY application.properties .
COPY application-test.properties .
ADD . employee_management_system_service.jar
ENTRYPOINT ["sh","/start.sh"]