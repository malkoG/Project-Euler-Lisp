(defun sum-of-multiples (n)
	(let ((sum 0))    
		(loop for i from 1 below n
		do (if (or (= (mod i 3) 0)
			   (= (mod i 5) 0))
			(incf sum i)))
	(print sum)))
        


(sum-of-multiples 1000)
