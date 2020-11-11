#!/bin/bash

echo "Welcome to Group 1's OSSP File Management application!"
echo "Please type the corresponding number below to select an option:"
echo "[1] Login"
echo "[2] Create account"
echo "[3] Exit"

read userchoice
re='^[0-9]+$'
while ! [[ $userchoice =~ $re ]] ; do
    echo "Error: Not a number, please enter a valid choice (1, 2, 3)"
    read userchoice
done
echo "You have chosen $userchoice"
while ! [[ $userchoice -eq 1 || $userchoice -eq 2 || $userchoice -eq 3 ]]; do
        echo "Error: Invalid input, please enter 1 to login, 2 to create an account, 3 to exit the program."
        read userchoice
        echo "You have chosen $userchoice"
done

if [[ $userchoice -eq 1 ]]; then
        echo "This menu would now transport the user to a login screen" #TODO: ADD CODE TO LAUNCH LOGIN
elif [[ $userchoice -eq 2 ]]; then
        echo "This menu would now transport the user to an account creation screen" #TODO: ADD CODE TO LAUNCH ACCOUNT CREATION
elif [[ $userchoice -eq 3 ]]; then
        echo "The file manager will now exit, goodbye!"
fi
