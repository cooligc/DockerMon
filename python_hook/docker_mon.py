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

class ContainerMon:

 def getAllContainer(self):
       """
       This will list all the running container and post the status to SlackBroker
       """
       client = docker.from_env()
       for container in client.containers.list(True):
          print container.name +"\t"+container.status
          postMessageSlack(container.name,container.status)
def startContainer(self):
       """
        This will run a container on docker
       """
       client = docker.from_env()
       client.containers.run("nginx")

def main():
      conmon = ContainerMon()
      conmon.getAllContainer()

if __name__ == "__main__":
  main()
