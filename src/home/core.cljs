(ns home.core
  (:require react
            react-dom))

(defn -main []
  (react-dom/render
    (react/create-element "div")
    (.getElementById js/document "root")))
