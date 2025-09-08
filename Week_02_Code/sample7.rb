# Lecture: TypingPartIII
# Summary: In this program we explore the benefits of dynamic typing through Ruby.

class Person
  def work
    puts "working..."
  end

  def method_missing(name, *args)
    # puts "you called #{name}"
    activities = ['Tennis', 'Football']

    # puts name.to_s.split('play')[1]

    activity = name.to_s.split('play')[1]

    if(activities.include?(activity))
      puts "I'd like to play #{activity}"
    else
      puts "Nope, I don't play #{activity}"
    end

  end
end

sam = Person.new
sam.work

sam.playTennis
sam.playFootball
sam.playPolitics