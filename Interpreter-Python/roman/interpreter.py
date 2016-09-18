from abc import ABCMeta, abstractmethod
from context import *

class Interpreter():
	__metaclass__ = ABCMeta

	def to_interpret(self, context):

		if len(context.get_input()) == 0:
			return

		if context.get_input().startswith(self.nine()):
			self.add_value_output(context, 9)
			self.consume_digits(context, 2)
		elif context.get_input().startswith(self.four()):
			self.add_value_output(context, 4)
			self.consume_digits(context, 2)
		elif context.get_input().startswith(self.five()):
			self.add_value_output(context, 5)
			self.consume_digits(context, 1)

		while context.get_input().startswith(self.one()):
			self.add_value_output(context, 1)
			self.consume_digits(context, 1)

	def consume_digits(self, context, digits):
		context.set_input(context.get_input()[digits:])

	def add_value_output(self, context, number):
		context.set_output(context.get_output() + number * self.weight())

	@abstractmethod
	def weight(self): pass

	@abstractmethod
	def one(self): pass

	@abstractmethod
	def four(self): pass

	@abstractmethod
	def five(self): pass

	@abstractmethod
	def nine(self): pass