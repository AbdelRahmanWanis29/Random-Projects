def isPrime(n):
    flag = True
    for i in range(2,n):
        if n % i == 0:
            flag = False
            break
    return flag

def findPrime(n):
    found = False
    i=1
    while found == False:
        if isPrime(n+i):
            found = True
            return n+i
        else:
            i+=1

def GetPrimeList(list,index):
    newlist = [list[index]]
    while index < len(list)-1:
        if findPrime(list[index]) == list[index+1]:
            newlist.append(list[index+1])
            index += 1
        else:
            return newlist
    return newlist

def LongestPL(L):
    PL = []
    for i in range(len(L)-1):
        if len(GetPrimeList(L,i)) > len(PL):
            PL = GetPrimeList(L,i)
    return PL


L = [5,7,13,17,19,23,31]
print(LongestPL(L))