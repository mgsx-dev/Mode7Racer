package mysko.pilzhere.mode7racer.entities.colliders;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

import mysko.pilzhere.mode7racer.entities.Entity;
import mysko.pilzhere.mode7racer.screens.GameScreen;

public class Edge extends Entity{
	
	public Edge(GameScreen screen, Vector3 position, float posX, float posZ, float width, float height) {
		super(screen, position);
		
		rect = new Rectangle(posX, posZ, width, height);
	}

//	@Override
//	public void render2D(SpriteBatch batch, float delta) {
//	}
	
//	@Override
//	public void render3D(ModelBatch batch, float delta) {
//	}
	
//	@Override
//	public void tick(float delta) {
//	}
	
//	@Override
//	public void destroy() {
//	}
	
//	@Override
//	public void dispose() {
//	}
}
