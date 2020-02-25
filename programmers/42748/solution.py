def solution(array, commands):
    answer = []

    for idx, value in enumerate(commands):
      temp = array[value[0]-1:value[1]]
      temp.sort()
      answer.append(temp[value[2]-1])

    return answer