package com.turtywurty.minecraftmadness.entity.tadpole;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTadpole extends ModelBase 
{
	public ModelRenderer head;
	public ModelRenderer tail_2;
	public ModelRenderer tail_1;
	public ModelRenderer tail_3;

	public ModelTadpole() 
	{
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.tail_1 = new ModelRenderer(this, 15, 3);
		this.tail_1.setRotationPoint(-0.5F, 22.0F, 0.0F);
		this.tail_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
		this.head = new ModelRenderer(this, 0, 0);
		this.head.setRotationPoint(-1.5F, 21.0F, -4.0F);
		this.head.addBox(0.0F, 0.0F, 0.0F, 3, 3, 4, 0.0F);
		this.tail_2 = new ModelRenderer(this, 22, 3);
		this.tail_2.setRotationPoint(-1.5F, 22.0F, 2.0F);
		this.tail_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
		this.tail_3 = new ModelRenderer(this, 29, 3);
		this.tail_3.setRotationPoint(-0.5F, 22.0F, 4.0F);
		this.tail_3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
	{
		this.tail_1.render(f5);
		this.head.render(f5);
		this.tail_2.render(f5);
		this.tail_3.render(f5);
	}

	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
