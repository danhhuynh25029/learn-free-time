def Binary(arr,k)
		l,r = 0,arr.length-1
		while l < r do
			tmp = (l+r)/2
			if arr[tmp] == k
					return true
			end

			if arr[tmp] > k
					r = tmp - 1
			else
					l = tmp + 1
			end
			#puts "#{l},#{r}"
		end
		return false
end

arr = [1,2,3,4,5]
r = Binary(arr,10)
puts r
