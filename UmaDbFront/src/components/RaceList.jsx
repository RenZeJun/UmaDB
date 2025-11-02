import React from "react";

const RaceList = ({ races }) => {
  return (
    <div className="grid gap-4 p-4">
      {races.map((race, index) => (
        <div
          key={index}
          className="rounded-2xl shadow p-4 bg-white border"
        >
          <h2 className="text-xl font-bold">{race.name}</h2>
          <p className="text-gray-600">{race.date}</p>

          <div className="mt-2">
            <p><span className="font-semibold">Field:</span> {race.field}</p>
            <p><span className="font-semibold">Distance:</span> {race.distance}</p>
          </div>

          {race.sparks && (
            <div className="mt-2">
              <span className="font-semibold">Sparks:</span>
              <ul className="list-disc list-inside">
                {race.sparks.map((spark, i) => (
                  <li key={i}>{spark}</li>
                ))}
              </ul>
            </div>
          )}
        </div>
      ))}
    </div>
  );
};

export default RaceList;