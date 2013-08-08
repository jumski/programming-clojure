(ns sandbox.defrecord)

(defrecord Person [first-name last-name])

(def foo (->Person "Stefan" "Burczymucha"))
