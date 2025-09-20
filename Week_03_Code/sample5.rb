# Lecture: ProceduresPartIII
# Summary: In this program we explore block structure and lexical scoping through Ruby.

# def sqrt(candidate)
#   def good_enough_guess(guess, candidate)
#     tolerance = 0.00000001
#     (guess * guess - candidate).abs < tolerance
#   end

#   def improve(guess, candidate)
#     (candidate / guess + guess) / 2
#   end

#   def sqrt_successive(guess, candidate)  
#     if good_enough_guess(guess, candidate)
#       guess
#     else
#       sqrt_successive(
#       improve(guess, candidate), candidate)
#     end
#   end
  
#   sqrt_successive(1, candidate)
# end 

def sqrt(candidate)
  sqrt_successive = Proc.new do |guess|
    improve = Proc.new { |guess|
      (candidate / guess + guess) / 2
    }
  
    good_enough_guess = Proc.new do |guess|
      tolerance = 0.00000001
      (guess * guess - candidate).abs < tolerance
    end

    if good_enough_guess.call(guess)
      guess
    else
      sqrt_successive.call(improve.call(guess))
    end
  end
  
  sqrt_successive.call(1)
end 