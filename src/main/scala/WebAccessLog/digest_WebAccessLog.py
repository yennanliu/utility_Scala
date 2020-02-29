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

# to fix : fix regular expression part, to extract the exact string
def load_web_log():
    pattern_host = re.compile(r'(?P<host>\S+)')
    pattern_user = re.compile(r'(?P<user>\S+)')
    pattern_request = re.compile(r'(?P<Get>\S+)')
    with open("data/access_log_small.txt") as f:
        for log in f:
            #print (log)
            host = pattern_host.match(log)
            user = pattern_user.match(log)
            request = pattern_request.match(log)
            print (host, time, request)
            print (user)


if __name__ == "__main__":
    load_web_log()
