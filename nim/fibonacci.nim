proc fibo(n:int): int = 
    if n < 2:
        result = n
    else:
        result = fibo(n-1) + (n-2).fibo
echo fibo(3)