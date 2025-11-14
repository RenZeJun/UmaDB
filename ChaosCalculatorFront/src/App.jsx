import React, { useEffect, useState } from "react";
import RaceList from "./components/RaceList";

function App() {
  const [races, setRaces] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    fetch("http://localhost:8080/api/races/allRaces")
      .then((res) => res.json())
      .then((data) => {
        setRaces(data);
        setLoading(false);
      })
      .catch((err) => {
        console.error("Error fetching races:", err);
        setLoading(false);
      });
  }, []);

  if (loading) return <p className="p-4">Loading...</p>;

  return (
    <div className="min-h-screen bg-gray-100">
      <h1 className="text-2xl font-bold p-4">Race List</h1>
      <RaceList races={races} />
    </div>
  );
}

export default App;
