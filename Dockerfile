FROM isl-dsdc.ca.com:5001/ca-standard-images/centos72-jre8-tomcat8:latest

ENV USER_NAME cdd
ENV GROUP_NAME cdd
ENV USER_HOME /home/$USER_NAME
ENV CDD_HOME_FOLDER $USER_HOME/.cdd
ENV CDD_CT_AGENT_HOME_FOLDER /usr/local/ct_agent

USER root

RUN groupmod -n $GROUP_NAME default
RUN usermod -l $USER_NAME  -d $USER_HOME -m  default

ENV TOMCAT_HOME /usr/local/apache-tomcat
ENV REPOSITORY_URL http://isl-dsdc.ca.com/artifactory
ENV DUMMY_APP_URL maven-integration-local/com/ca/cdd/tests_resources/ct_agent/dummy_app
ENV CT_AGENT_URL maven-integration-local/com/ca/cdd/trunk/ct_agent/1.1-SNAPSHOT/ct_agent-1.1-SNAPSHOT.jar
ENV JAVA_OPTS=' -javaagent:$CDD_CT_AGENT_HOME_FOLDER/ct_agent.jar'

USER cdd

ARG WAR_URL=$REPOSITORY_URL/"$DUMMY_APP_URL/dummy.war"
ADD $WAR_URL $TOMCAT_HOME/webapps/dummy.war

ARG WSE_URL=$REPOSITORY_URL/$CT_AGENT_URL
ADD $WSE_URL $CDD_CT_AGENT_HOME_FOLDER/ct_agent.jar

USER root
RUN chown cdd:cdd $TOMCAT_HOME/webapps/dummy.war
RUN chown cdd:cdd $CDD_CT_AGENT_HOME_FOLDER/ct_agent.jar
RUN chmod 777 $CDD_CT_AGENT_HOME_FOLDER/ct_agent.jar

RUN mkdir -p $CDD_HOME_FOLDER/conf   
COPY ./settings.properties $CDD_HOME_FOLDER/conf/settings.properties
RUN chown -R cdd:cdd $CDD_CT_AGENT_HOME_FOLDER
RUN chown -R cdd:cdd $CDD_HOME_FOLDER

USER cdd

EXPOSE 8080
VOLUME $CDD_HOME_FOLDER
CMD ["catalina.sh", "run"]
