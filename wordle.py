import random
wordbank = ["apple","bread","crane","dance","eagle","flute","grape","hound","input","jelly","knock","lemon","mango","noble","ocean","piano","quack","robot","spice","table","under","vivid","whale","xenon","young","zebra"]

word = random.choice(wordbank)
attempts = 10
print("Welcome to Wordle!")
print("You have 10 attempts to guess the 5-letter word.")

output = ["_"] * 5

print("Enter a letter and if the letter is in the word, it will be revealed.")
flag = False

while attempts > 0:
    print("Attempts left:  ", attempts)
    print("Current word:", output)
    guess = input("Enter a letter: ").lower()
    if len(guess)!= 1:
        print("Please enter only one letter.")
        continue
    if guess not in "abcdefghijklmnopqrstuvwxyz":
        print("Please enter a valid letter.")
        continue
    if guess in word:
        for i in range(5):
            if word[i] == guess:
                output[i] = guess
        print("Good guess!")
        print("Current word: ", output)
    else:
        print("Sorry, that letter is not in the word.")
    if "_" not in output:
        flag = True
    attempts -= 1

if flag:
    print("Congratulations! You've guessed the word:", word)
else:
    print("Sorry, you've run out of attempts. The word was:", word)