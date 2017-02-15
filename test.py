  
from top.alision.www import  SayHelloCallback
  
execpy = SayHelloCallback()  
  
f = open('users', 'r')
for line in f.readlines():
    execpy.username(line)
# def say():  
#     execpy.say(5)  
#     return  
  
# say()  
