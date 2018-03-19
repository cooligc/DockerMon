import docker
import requests


def postMessageSlack(name,status):
      """
       Post the message to SlackBroker 
      """
      data = '''{"channel":"general","message":"container %d is %s"}'''
      # Need to improve using format method
      data = data.replace("%d",name)
      data = data.replace("%s",status)
      response = requests.post(url="http://localhost:8080/v1/messages",data=data,headers = {'content-type': 'application/json'})
      print response.json()


def processContainerRequest():
      """
       Post the message to SlackBroker 
      """
      data = '''{"channel":"general","message":"container %d is %s"}'''
      # Need to improve using format method
      data = data.replace("%d",name)
      data = data.replace("%s",status)
      response = requests.post(url="http://localhost:8080/v1/messages",data=data,headers = {'content-type': 'application/json'})
      print response.json()

class ContainerMon:

 def getAllContainer(self):
       """
       This will list all the running container and post the status to SlackBroker
       """
       client = docker.from_env()
       for container in client.containers.list(True):
          print container.name +"\t"+container.status
          postMessageSlack(container.name,container.status)
 def startContainer(self,containerName):
       """
        This will run a container on docker
       """
       client = docker.from_env()
       client.containers.run(containerName,detach=True)
 def stopContainer(self,containerName):
       """
        This will stop the container based on the container name
       """
       client = docker.from_env()
       container = client.containers.get(containerName)
       container.stop()
 def restartContainer(self,containerName):
       """
        This will stop the container based on the container name
       """
       client = docker.from_env()
       container = client.containers.get(containerName)
       container.restart()


def main():
      conmon = ContainerMon()
      conmon.getAllContainer()
      #conmon.startContainer("nginx")
      #print "nginx container is started"
      #conmon.stopContainer("nginx")
      #print "nginx container is stopped"

if __name__ == "__main__":
  main()
