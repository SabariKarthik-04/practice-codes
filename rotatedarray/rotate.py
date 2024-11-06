def plusOne( digits):
    s=""
    for i in digits:
        s=s+str(i)
        print(i)
    s=int(s)+1
    s=str(s)
    r=[]
    for x in range(0,len(s)):
        r.append(int(s[x]))

    return r
        

nums = [1,2,3,]
r=plusOne(nums)
print(r)