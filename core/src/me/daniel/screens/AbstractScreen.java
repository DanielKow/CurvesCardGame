package me.daniel.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

import me.daniel.game.MyGame;

public abstract class AbstractScreen implements Screen {

	public MyGame game;
	public SpriteBatch batch;
	public Stage stage;
	
	private OrthographicCamera camera;
	
	public AbstractScreen(MyGame game) {
		this.game = game;
		createCamera();
		stage = new Stage(new StretchViewport(MyGame.WIDTH, MyGame.HEIGHT, camera));
		batch = new SpriteBatch();
		Gdx.input.setInputProcessor(stage);
		init();
	}
	
	protected abstract void init();

	private void createCamera() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, MyGame.WIDTH, MyGame.HEIGHT);
		camera.update();
	}

	@Override
	public void render(float delta) {
		clearScreen();
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		tick();
		
		batch.begin();
		
		stage.draw();
		
		batch.end();
	}

	private void tick() {
		stage.act();
		if(Gdx.input.isKeyPressed(Keys.ESCAPE)) {
			dispose();
			Gdx.app.exit();
		}
	}

	private void clearScreen() {
		Gdx.gl20.glClearColor(0, 0, 0, 0);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void pause() {
		game.setPaused(true);
	}

	@Override
	public void resume() {
		game.setPaused(false);
	}

	@Override
	public void dispose() {
		batch.dispose();
		game.dispose();
		stage.dispose();
	}

	/*
	 *
	 * Unused unimplemented methods
	 *
	 */
	
	@Override
	public void hide() {}

	@Override
	public void show() {}
	
	@Override
	public void resize(int width, int height) {}

}