values = [1, 2, 3, 4, 5, 6]

# puts values.count

# values.each { |e| puts e }
# Internal iterator

# puts values.map { |e| e - 1 } 
# blocks or function values

# puts values.find { |e| e % 2 == 0 }

# result = values.find_all { |e| e % 2 == 0 }

# for i in 0..result.count-1
    # print "#{result[i]}"
    # print ',' if (i != result.count-1)
    # print ' '
# end

# puts result.join(', ')

# puts values.find_all { |e| e % 2 == 0}.join(', ')

# total = 0
# values.each { |e| total += e }
# puts "Total is #{total}"
# can't be used until total is bound. But where is total?

# Because it closes over the scope, it is called a closure.

# e is bound to parameter but total is bound to a variable 
# in the scope of the caller of the function your block is called from
# It is bound to the score where the block is being defined

# level 1 is where total is defined
# level 2 is inside each method
# level 3 is inside the block

# From block (level 3 total is bound to variable in level 1)

# { |e| e * 2}
# This is simply a block or a function value.

# If you consider { |e| e * factor }
# This is a closure bacause factor has to be bounded or closed over 
# to a variable outside in scope

# p1 p2 p3 p4
# 15 20 25 28

# Without automatic garbage collection it would be 
# real hard to program functional style with 
# immutability!

# John Peter Paul Sam
# 15   20    25   28

# Sam create a new postit note with 28 on it and 
# gives it to Paul
# Paul create a new postit note with 53 and gives it to
# Peter
# Peter create a new postit note with 73 and give it to 
# John

# puts values.inject(0) { |carryOver, e| carryOver + e }

# 1. carryOver is bound to 0 and e is bound to 1
# The function returns 1 (carryOver + e)
# 2. inject now calls the function again, this time
# with carryOver bound to 1 and e bound to 2
# The function returns 3 (carryOver + e)
# 3. inject now calls the function again, this time
# with carryOver bound to 3 and e bound to 3
# The function returns 6 (carryOver + e) 