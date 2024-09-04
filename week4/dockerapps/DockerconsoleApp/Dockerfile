FROM docker.repository.esi.adp.com/clientcentral/java:17.0.1-jdk
COPY . /var/www/java  
WORKDIR /var/www/java  
RUN javac Demo.java  
CMD ["java", "Demo"]  