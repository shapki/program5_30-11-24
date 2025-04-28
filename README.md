# МДК.01.03 Разработка мобильных приложений
### Coroutines | 10 задач

> Решить задачи, представленные ниже. Для каждого запуска выводить информацию о времени, затраченном на выполнение программы

------------

### Задача 5
Дан массив nums, содержащий n различных чисел в диапазоне [0, n]. Вернуть единственное число в диапазоне, отсутствующее в массиве.

**Example 1:**

    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

**Example 2:**

    Input: nums = [0,1]
    Output: 2
    Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

**Example 3:**
    
    Input: nums = [9,6,4,2,3,5,7,0,1]
    Output: 8
    Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
    Constraints:
    
    n == nums.length
    1 <= n <= 104
    0 <= nums[i] <= n
    All the numbers of nums are unique.
