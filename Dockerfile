FROM      golang:1.13.0-alpine3.10
RUN       mkdir /webserver
ADD       . /webserver
WORKDIR   /webserver
RUN       go build -o main .
EXPOSE    8080
CMD      ["/webserver/main"]

      
