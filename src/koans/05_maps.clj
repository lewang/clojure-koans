(meditations
  "Don't get lost when creating a map"
  (= {:a 1 :b 2} (hash-map :a 1 :b 2))
        ;;; ⇒ true

  "A value must be supplied for each key"
  (= {:a 1} (hash-map :a 1))
        ;;; ⇒ true

  "The size is the number of entries"
  (= 2 (count {:a 1 :b 2}))
        ;;; ⇒ true

  "You can look up the value for a given key"
  (= 2 (get {:a 1 :b 2} :b))
        ;;; ⇒ true

  "Maps can be used as functions to do lookups"
  (= 1 ({:a 1 :b 2} :a))
        ;;; ⇒ true

  "And so can keywords"
  (= 1 (:a {:a 1 :b 2}))
        ;;; ⇒ true

  "But map keys need not be keywords"
  (= "Vancouver" ({2006 "Torino" 2010 "Vancouver" 2014 "Sochi"} 2010))
        ;;; ⇒ true

  "You may not be able to find an entry for a key"
  (= nil (get {:a 1 :b 2} :c))
        ;;; ⇒ true

  "But you can provide your own default"
  (= :key-not-found (get {:a 1 :b 2} :c :key-not-found))
        ;;; ⇒ true

  "You can find out if a key is present"
  (= true (contains? {:a nil :b nil} :b))
        ;;; ⇒ true

  "Or if it is missing"
  (= false (contains? {:a nil :b nil} :c))
        ;;; ⇒ true

  "Maps are immutable, but you can create a new and improved version"
  (= {1 "January" 2 "February"} (assoc {1 "January" } 2 "February"))
        ;;; ⇒ true

  "You can also create a new version with an entry removed"
  (= {1 "January"} (dissoc {1 "January" 2 "February"} 2))
        ;;; ⇒ true

  "Often you will need to get the keys, but the order is undependable"
  (= (list 2006 2010 2014)
     (sort (keys {2006 "Torino" 2010 "Vancouver" 2014 "Sochi"})))
        ;;; ⇒ true

  "You can get the values in a similar way"
  (= (list "Sochi" "Torino" "Vancouver")
     (sort (vals {2006 "Torino" 2010 "Vancouver" 2014 "Sochi"})))
        ;;; ⇒ true

  )
