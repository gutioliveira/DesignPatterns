from one_digit import *
from two_digits import *
from three_digits import *
from four_digits import *
from context import *

digits = [FourDigits(),ThreeDigits(),TwoDigits(),OneDigit()]

context = Context("VI")

for d in digits:
	d.to_interpret(context)

print context.get_output()