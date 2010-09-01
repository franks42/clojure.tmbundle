#!/usr/bin/env cake
(ns textmate)

(println (clojure.pprint/pprint (sort (map str (all-ns)))))