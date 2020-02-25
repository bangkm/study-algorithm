def solution(answers):
    answer = []
  
    a = [1,2,3,4,5]
    b = [2,1,2,3,2,4,2,5]
    c = [3,3,1,1,2,2,4,4,5,5]
    results = [0,0,0]
  

    for idx, r in enumerate(answers):
        if r == a[idx%len(a)]:
            results[0] += 1
        if r == b[idx%len(b)]:
            results[1] += 1
        if r == c[idx%len(c)]:
            results[2] += 1

    for idx, result in enumerate(results):
        if result == max(results):
            answer.append(idx+1)
      
    return answer