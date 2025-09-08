# Lecture: ExpressionsAndSymbols
# Summary: In this program we explore expressions vs. statements and symbols with Ruby.

# def isEven(number)
#   result = "odd"
#   result = "even" if (number % 2 == 0)
#   result
# end

# def isEven(number)
#   result = if (number % 2 == 0)
#     "even"
#   else
#     "odd"
#   end

#   "The given number is #{result}"
# end

# puts isEven(4)
# puts isEven(3)

# def foo(number)
#   for i in 1..4
#     puts i
#   end

#   puts "hello"
# end

# puts foo(4)


# symbol as a reference to as
# variable. 

# If i say :blah, then read this 
# as a symbol that refers to 
# an item or something called blah.

# class Car
#   def tow
#     puts "tow called..."
#   end
#   private :tow
# end

# car = Car.new
# car.tow


# x = 4
# puts x
# puts x.class

# puts 'x'
# puts 'x'.class

# puts :x
# puts :x.class

class Person
  def method_missing(name, *args)
    puts "You called #{name}"
    puts name.class
  end
end

sam = Person.new
sam.sing