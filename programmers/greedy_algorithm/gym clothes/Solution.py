def solution(n, lost, reserve):
    answer = 0
    hadUniform = [1] * n
    
    for i in range(len(lost)):
        hadUniform[lost[i] - 1] -=1
    
    for i in range(len(reserve)):
        hadUniform[reserve[i] - 1] += 1 
    
    for i, v in enumerate(hadUniform):
        if i > 0 and v == 0 and hadUniform[i-1] > 1:
            hadUniform[i] += 1
            hadUniform[i-1] -= 1
        elif i < n-1 and v == 0 and hadUniform[i+1] > 1:
            hadUniform[i] += 1
            hadUniform[i+1] -= 1
            
    answer = n - hadUniform.count(0)
    
    return answer
