from interpreter import *

class ThreeDigits(Interpreter):

	def one(self):
		return "C"

	def four(self):
		return "CD"

	def five(self):
		return "D"

	def nine(self):
		return "CM"

	def weight(self):
		return 100;