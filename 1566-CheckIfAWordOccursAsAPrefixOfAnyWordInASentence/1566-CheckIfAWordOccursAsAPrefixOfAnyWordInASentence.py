# Last updated: 23/04/2026, 00:03:24
class Solution:
  def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
    words = sentence.split()

    for i, word in enumerate(words):
      if word.startswith(searchWord):
        return i + 1

    return -1