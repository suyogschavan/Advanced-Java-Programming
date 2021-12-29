#!/bin/sh
# Program to print the
# given pattern

echo "Enter number of lines to print"
read N


# variable used for
# while loop
i=0
j=0

while [ $i -le `expr $N - 1` ]
do
	j=0
	
	while [ $j -le `expr $N - 1` ]
	do
		if [ `expr $N - 1` -le `expr $i + $j` ]
		then
		# Print the pattern
		printf "*"
		else
		# Print the spaces required
		printf " "
		fi
		j=`expr $j + 1`
	done
	# For next line
	echo
			
	i=`expr $i + 1`
done
