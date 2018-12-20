package frc.robot.PathGeneration;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import jaci.pathfinder.modifiers.TankModifier;

public class Generator {
  
    public Generator(){
    }
        public static void main (String[] args){
            Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_QUINTIC, Trajectory.Config.SAMPLES_HIGH, 0.05, 6.54, 1.66, 24.49);
            Waypoint[] places = new Waypoint[] {
        
              new Waypoint(2, 2, Pathfinder.d2r(45)),
              new Waypoint(1, 2, Pathfinder.d2r(180)),
              new Waypoint(3, 2, Pathfinder.d2r(0)),
              new Waypoint(2, 2, Pathfinder.d2r(-135)),
              new Waypoint(0, 0, Pathfinder.d2r(180))
              
            };
        
            Trajectory trajectory = Pathfinder.generate(places, config);
        
            TankModifier modifier = new TankModifier(trajectory).modify(.6096);
        
            Trajectory left = modifier.getLeftTrajectory();
            Trajectory right = modifier.getRightTrajectory();
          }

    

}