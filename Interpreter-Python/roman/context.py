class Context():
	_input = ""
	_output = 0

	def __init__(self, input_context):
		self._input = input_context

	def get_input(self):
		return self._input

	def set_input(self, _input):
		self._input = _input

	def get_output(self):
		return self._output

	def set_output(self,_output):
		self._output = _output