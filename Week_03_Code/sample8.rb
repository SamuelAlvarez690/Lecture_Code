# Lecture: ProceduresPartIV
# Summary: In this program we explore writing procedures through Ruby.

# def add(op1, op2)
#   op1 + op2
# end

# puts add(1,2)

# def max(num1, num2)
#   max_value = num1
#   if num2 > max_value
#     max_value = num2
#   end
# end

def max(*numbers)
  max_value = numbers[0]

  numbers.each do |e|
    max_value = e if e > max_value
  end

  max_value
end

puts max(1, 2, 4 , 3, 0)