import chapter_2.*

// test out functions
println(max(1,2))
println(max(100, 2000))

println(min(1, 100))

// testing bounds of vals and vars
println(ten)
println(eleven)

//ten = 11, ten is an immutable reference.
eleven = 12

println(ten)
println(eleven)

// eleven = "New String", cannot change the type of the reference
// statically typed!

// String Templates
println("I can count to $ten but not $eleven")