from pydantic import BaseModel

class Cat(BaseModel):
    name='Olivia'
    age=1
    cuteness="maximum"