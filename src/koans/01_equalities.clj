(meditations
  "We shall contemplate truth by testing reality, via equality"
  (= true true)
        ;;; ⇒ true

  "To understand reality, we must compare our expectations against reality"
  (= 2 (+ 1 1))
        ;;; ⇒ true

  "You can test equality of many things"
  (= (+ 3 4) 7 (+ 2 5))
        ;;; ⇒ true

  "Some things may appear different, but be the same"
  (= true (= 2 2/1))
        ;;; ⇒ true

  "You cannot generally float to heavens of integers"
  (= false (= 2 2.0))
        ;;; ⇒ true

  "But a looser equality is also possible"
  (= true (== 2.0 2))
        ;;; ⇒ true

  "Something is not equal to nothing"
  (= true (not (= 1 nil)))
        ;;; ⇒ true

  "Strings, and keywords, and symbols: oh my!"
  (= false (= "foo" :foo 'foo))
        ;;; ⇒ true

  "Make a keyword with your keyboard"
  (= :foo (keyword 'foo))
        ;;; ⇒ true

  "Symbolism is all around us"
  (= 'foo (symbol "foo"))
        ;;; ⇒ true

  "When things cannot be equal, they must be different"
  (not= :fill-in-the-blank 1)
        ;;; ⇒ true

  )
