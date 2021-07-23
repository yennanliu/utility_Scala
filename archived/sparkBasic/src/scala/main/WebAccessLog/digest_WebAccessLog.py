"""
py script demo how to extract/digest from web access log 
"""
import re

parts = [
    r'(?P<host>\S+)',                   # host %h
    r'\S+',                             # indent %l (unused)
    r'(?P<user>\S+)',                   # user %u
    r'\[(?P<time>.+)\]',                # time %t
    r'"(?P<request>.+)"',               # request "%r"
    r'(?P<status>[0-9]+)',              # status %>s
    r'(?P<size>\S+)',                   # size %b (careful, can be '-')
    r'"(?P<referer>.*)"',               # referer "%{Referer}i"
    r'"(?P<agent>.*)"',                 # user agent "%{User-agent}i"
]

pattern = re.compile(r'\s+'.join(parts)+r'\s*\Z')

def extractURLRequest(line):
    exp = pattern.match(line)
    if exp:
        request = exp.groupdict()["request"]
        if request:
           requestFields = request.split()
           if (len(requestFields) > 1):
                return requestFields[1]

def extractRequest(line):
    exp = pattern.match(line)
    if exp:
        status = exp.groupdict()["request"]
        if status:
            return status

def extractTime(line):
    exp = pattern.match(line)
    if exp:
        t = exp.groupdict()["time"]
        if t:
            return t

def extractStatus(line):
    exp = pattern.match(line)
    if exp:
        s = exp.groupdict()["status"]
        if s:
            return s

def digest_web_log():
    with open("data/access_log_small.txt") as f:
        for log in f:
            #print (log)
            request = extractRequest(log)
            time = extractTime(log)
            status = extractStatus(log)
            print ("""
                   time : {},  
                   request : {},
                   status  : {}
                   """.format(time, request, status))

if __name__ == "__main__":
    digest_web_log()
