FROM openjdk:17
COPY ./ /tmp
WORKDIR /tmp
RUN ["javac","Main.java"]
ENTRYPOINT [ "java", "Main" ]