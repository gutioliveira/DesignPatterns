from interpreter import *

class TwoDigits(Interpreter):

	def one(self):
		return "X"

	def four(self):
		return "XL"

	def five(self):
		return "L"

	def nine(self):
		return "XC"

	def weight(self):
		return 10;